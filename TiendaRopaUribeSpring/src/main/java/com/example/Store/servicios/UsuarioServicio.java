package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionUsuario;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class   UsuarioServicio {

    //En los servicios debo inyectar las dependencias de las validaciones y las consultas o repositorios.

    @Autowired
    ValidacionUsuario validacionUsuario;
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    //En el servicio se crea un metodo para cada una de las consultas a realizar en bd.

    //Guardar usuario.

    public Usuario guardarUsuario(Usuario datosUsuario)throws Exception{
        try {
            if (!validacionUsuario.validarNombres(datosUsuario.getNombres())){
                throw new Exception("nombre invalido");
            }
            if (!validacionUsuario.validarCorreo(datosUsuario.getCorreo())){
                throw new Exception("correo invalido");
            }
            if (!validacionUsuario.validarCedula(datosUsuario.getCedula())){
                throw new Exception("cedula invalida");
            }
            if (!validacionUsuario.validarSexo(datosUsuario.getSexo())){
                throw new Exception("sexo invalido");
            }
            if (!validacionUsuario.codigoPostal(datosUsuario.getCodigoPostal())){
                throw new Exception("codigo postal invalido");
            }
            return usuarioRepositorio.save(datosUsuario);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Consultar usuario por id.

    public Usuario buscarUsuarioPorId(Integer idUsuario)throws Exception{
        try {
            if (usuarioRepositorio.findById(idUsuario).isPresent()){
                return usuarioRepositorio.findById(idUsuario).get();
            }else {
                throw new Exception("usuario no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //consultar todos los usuarios

    public List<Usuario> buscarTodosLosUsuarios()throws Exception{
        try {
            return usuarioRepositorio.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //Editar un usuario.

    public Usuario modificarUsuario(){
        return null;
    }

    //Eliminar un usuario.

    public boolean eliminarUsuario(){
        return true;
    }


}
