package com.proyect.lab8__20203644.Controller;

import com.proyect.lab8__20203644.Entity.Estudiante;
import com.proyect.lab8__20203644.Entity.Facultad;
import com.proyect.lab8__20203644.Repository.EstudianteRepository;
import com.proyect.lab8__20203644.Repository.FacultadRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class EstudianteController {

    final EstudianteRepository estudianteRepository;
    final FacultadRepository facultadRepository;
    public EstudianteController(EstudianteRepository estudianteRepository, FacultadRepository facultadRepository){
        this.estudianteRepository=estudianteRepository;
        this.facultadRepository=facultadRepository;

    }

    @GetMapping("/estudiantes")
    public List<Estudiante> listaEstuadiantes(){
        return estudianteRepository.findAll();
    }


    @PostMapping("/crearestudent")
    public ResponseEntity<Map<String,Object>> creaciondeEstudiante(@RequestBody Estudiante estudiante,@RequestParam(value="fetchedId",required=false) boolean fetchedId){
        Map<String,Object> respuesta = new HashMap<>();
        estudianteRepository.save(estudiante);
        if(fetchedId){
            respuesta.put("id",estudiante.getIdestudiante());
        }
        respuesta.put("estado","ha sido creado");
        return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
    }

    @PostMapping("/actualizando")
    public ResponseEntity<Map<String,Object>> actaulizandoEstudiante(@RequestBody Estudiante estudiante){
        Map<String,Object> respuesta = new HashMap<>();

        if(estudiante.getIdestudiante()!=null & estudiante.getIdestudiante()>0){
            Optional<Estudiante> estudiant= estudianteRepository.findById(estudiante.getIdestudiante());

        }
    }
}
