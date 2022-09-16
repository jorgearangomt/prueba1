package com.inventarioAPP.modelo;

import com.inventarioAPP.modelo.controlador.ControladorProducto;
import com.inventarioAPP.modelo.RepositorioProducto;
import com.inventarioAPP.modelo.vista.Vista;
import java.util.ArrayList;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class ProductosApplication {
    @Autowired
    RepositorioProducto repPro;
    ArrayList<Producto> lista;

	public static void main(String[] args) {
//		SpringApplication.run(ProductosApplication.class, args);
                SpringApplicationBuilder builder = new SpringApplicationBuilder(ProductosApplication.class);
                builder.headless(false);
                ConfigurableApplicationContext context = builder.run(args);
              
	}
        @Bean
        ApplicationRunner applicationRunner(){
          return args ->{
              final Log logger = LogFactory.getLog(getClass());
              Vista vista = new Vista();
              ControladorProducto controlador = new ControladorProducto(repPro,vista);
              controlador.setListaProducto(controlador.obtenerProductos());
              vista.setControlador(controlador);
              controlador.valoresTabla();



          };
        }
}
