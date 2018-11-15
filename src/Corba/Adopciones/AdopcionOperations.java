package Corba.Adopciones;


public interface AdopcionOperations 
{
  boolean insertarAdopcion (int cedula, int idMascota, String nombre, String direccion, String correo, String nacionalidad, int edad);
  boolean actualizarAdopcion (int cedula, int idMascota, String nombre, String direccion, String correo, String nacionalidad, int edad);
  boolean eliminarAdopcion (int cedula);
  String consultarAdopcion (int cedula);
  void shutdown ();
} // interface AdopcionOperations
