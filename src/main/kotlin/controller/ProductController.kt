package com.example.klotin_practica_2.controller

import com.example.klotin_practica_2.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ProductController {
    @Autowired
    lateinit var productService: ProductService

    @GetMapping("/hola")
    fun saludo(): String {
        return "Hola mundo"
    }

    @GetMapping("/adios")
    fun despedida(): String {
        return "Adios mundo"
    }

    @GetMapping("/SaludoService")
    fun saludoService(): String {
        return this.productService.saludoService()
    }
}