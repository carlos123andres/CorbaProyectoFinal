package Acudientes;


/**
* Acudientes/AcudienteOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Acudiente.idl
* martes 13 de noviembre de 2018 16H11' COT
*/

public interface AcudienteOperations 
{
  boolean insertarAcudiente (int identificacion, String nombre, String apellido, String telefono, String direccion, String correo);
  boolean actualizarAcudiente (int identificacion, String nombre, String apellido, String telefono, String direccion, String correo);
  boolean eliminarAcudiente (int identificacion);
  String consultarAcudiente (int identificacion);
  void shutdown ();
} // interface AcudienteOperations
