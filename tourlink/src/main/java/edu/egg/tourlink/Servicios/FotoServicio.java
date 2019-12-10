
package edu.egg.tourlink.Servicios;

import edu.egg.tourlink.Entidades.Foto;
import edu.egg.tourlink.Repositorios.FotoRepositorio;
import edu.egg.tourlink.errores.ErrorServicio;
import java.io.IOException;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FotoServicio {
    @Autowired
    private FotoRepositorio fotoRepositorio;
    
    @Transactional
    public Foto guardar(MultipartFile archivo) throws ErrorServicio, IOException{
        if(archivo == null){
           try{
            Foto foto = new Foto();
            foto.setMime(archivo.getContentType());
            foto.setNombre(archivo.getName());
            foto.setContenido(archivo.getBytes());          
            return fotoRepositorio.save(foto);
           }catch(Exception a){
               System.out.println(a.getMessage());
           }
        }
            return null;  
    }
    
    @Transactional
    public Foto actualizar (String idFoto,MultipartFile archivo) throws ErrorServicio{
       if(archivo == null){
           try{
            Foto foto = new Foto();
            if(idFoto != null){
                Optional<Foto> respuesta = fotoRepositorio.findById(idFoto);
                if(respuesta.isPresent()){
                    foto =  respuesta.get();
                }
            }
            foto.setMime(archivo.getContentType());
            foto.setNombre(archivo.getName());
            foto.setContenido(archivo.getBytes());          
            return fotoRepositorio.save(foto);
           }catch(Exception a){
               System.out.println(a.getMessage());
           }
        }
            return null;   
    }
}