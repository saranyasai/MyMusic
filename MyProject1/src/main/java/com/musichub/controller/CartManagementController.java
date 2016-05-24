package com.musichub.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.musichub.dao.CartItemService;
import com.musichub.dao.CartService;
import com.musichub.dao.ItemService;
import com.musichub.dao.UserService;
import com.musichub.model.Cart;

@Controller
public class CartManagementController {
	  @Autowired
	    private CartService cartService;

	    @Autowired
	    private CartItemService cartItemService;

	    @Autowired
	    private UserService usersDetailService;

	    @Autowired
	    private ItemService itemService;

	    @RequestMapping("/refreshCart/{cartId}")
	    public @ResponseBody
	    Cart getCartById (@PathVariable(value = "cartId") int cartId) {
	        return cartService.getCartById(cartId);
	    }
	    /*
	     * addItem method is used to add a item in user cart.
	     */

	    @RequestMapping(value = "/addItem/{itemId}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void addItem (@PathVariable(value ="itemId") int itemId, @AuthenticationPrincipal User activeUser) {

	    	User3 usersDetail = usersDetailService.getUserByUsername(activeUser.getUsername());
	        Cart cart = usersDetail.getCart();
	        Item item = itemService.getItemById(itemId);
	        List<CartItem> cartItems = cart.getCartItems();

	        for (int i=0; i<cartItems.size(); i++) {
	            if(item.getItemId()==cartItems.get(i).getItem().getItemId()){
	                CartItem cartItem = cartItems.get(i);
	                cartItem.setQuantity(cartItem.getQuantity()+1);
	                cartItem.setTotalPrice(item.getItemPrice()*cartItem.getQuantity());
	                cartItemService.addCartItem(cartItem);

	                return;
	            }
	        }

	        CartItem cartItem = new CartItem();
	        cartItem.setItem(item);
	        cartItem.setQuantity(1);
	        cartItem.setTotalPrice(item.getItemPrice()*cartItem.getQuantity());
	        cartItem.setCart(cart);
	        cartItemService.addCartItem(cartItem);
	    }
	    /*
	     * removeItem method is used to remove a item from user cart.
	     */
	    @RequestMapping(value = "/removeItem/{itemId}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void removeItem (@PathVariable(value = "itemId") int itemId) {
	        CartItem cartItem = cartItemService.getCartItemByItemId(itemId);
	        cartItemService.removeCartItem(cartItem);

	    }
	    /*
	     * clearCartItems method is used to remove all items from user cart.
	     */
	    @RequestMapping(value = "/clearCartItems/{cartId}", method = RequestMethod.DELETE)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void clearCartItems(@PathVariable(value = "cartId") int cartId) {
	        Cart cart = cartService.getCartById(cartId);
	        cartItemService.removeAllCartItems(cart);
	    }
	    /*
	     * ExceptionHandler for client errors.
	     */
	    @ExceptionHandler(IllegalArgumentException.class)
	    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, please verify your payload.")
	    public void handleClientErrors (Exception e) {}
	    /*
	     * ExceptionHandler for server errors.
	     */
	    @ExceptionHandler(Exception.class)
	    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error.")
	    public void handleServerErrors (Exception e) {}
	}


