package Mascotas;


/**
* Mascotas/MascotaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Mascota.idl
* martes 13 de noviembre de 2018 13H48' COT
*/

public interface MascotaOperations 
{
  boolean insertarMascota (int codigo, String apodo, String especie, String raza, String colorPelo, String fechaNacimiento, int numeroVacuna, String nombreVacuna);
  boolean actualizarMascota (int codigo, String apodo, String especie, String raza, String colorPelo, String fechaNacimiento, int numeroVacuna, String nombreVacuna);
  boolean eliminarMascota (int codigo);
  String consultarMascota (int codigo);
  void shutdown ();
} // interface MascotaOperations