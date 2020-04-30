package com.uca.tarea4.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.tarea4.domain.Producto;


@Controller
public class MainController {

	@GetMapping("/producto")
	public ModelAndView compraProducto(@Valid @ModelAttribute Producto prodcuto, BindingResult result){
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		mav.addObject("producto", new Producto());
		return mav;
	}
	
	@PostMapping("/validar")
	public ModelAndView validarProducto(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("index");
		}else {
			mav.setViewName("productoComprado");
			mav.addObject("nombre",producto.getNombre());
		}
		return mav;
	}
}
