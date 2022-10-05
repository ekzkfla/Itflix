package com.itflix.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itflix.controller.interceptor.LoginCheck;


public class MovieGirdfwController {
	/*
	@Autowired
	private MovieServie movieServie; 
	*/
	/*
	 * <<< 주문 정보 session 저장 >>> - 주문시 카트 번호를 전달하기 위한 array
	 * session.setAttribute("cart_item_noStr_array", cart_item_noStr_array); -
	 * 주문form에 상품정보 출력을 위한 list session.setAttribute("cartItemList", cartItemList);
	 * - 주문 정보를 저장하는 Order 객체 session.setAttribute("order", order);
	 */
	/*
	 * 주문 상품 정보 저장 
	 * 주문자 정보로 이동
	 */
	/*
	@LoginCheck
	@PostMapping("/checkout_2")
	public String order_orderer_form(HttpSession session, String buyType, String p_no, String qty,
			@RequestParam(value = "cart_no", required = false) String[] cart_item_noStr_array, Model model) {

		String sM_id = (String) session.getAttribute("sM_id");
		// 주문할 상품리스트를 담을 cartItemList. 주문 form에 상품정보 출력을 위한 list다.
		List<Cart> cartItemList = new ArrayList<>();
		try {
			List<Cart> cartList = cartService.cartListAll(sM_id); 
			if (buyType.equals("cart_select")) {
				// 장바구니 선택 주문의 경우, 전달된 cart번호로 cart객체를 가져와 리스트에 세팅
				for (String cart_item_noStr : cart_item_noStr_array) {
					cartItemList.add(cartService.getCartByNo(Integer.parseInt(cart_item_noStr)));
				}
				// 주문시 카트 번호를 전달하기 위한 array
				session.setAttribute("cart_item_noStr_array", cart_item_noStr_array);
				
			} else if (buyType.equals("direct")) {
				// 바로 주문의 경우 상품번호로 상품객체를 가져와 상품객체와 수량을 카트객체에 세팅 후, 카트객체를 리스트에 세팅
				Product product = productService.selectProductDetail(Integer.parseInt(p_no));
				cartItemList.add(new Cart(0, Integer.parseInt(qty), product, sM_id));
				session.setAttribute("p_no", p_no);
				session.setAttribute("qty", qty);
				
			} else if (buyType.equals("cart")) {
				cartItemList = cartList;
			}
			session.setAttribute("buyType", buyType);
			session.setAttribute("cartItemList", cartItemList);
			model.addAttribute("cartList", cartList);
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "checkout-2";
	}
	*/
}
