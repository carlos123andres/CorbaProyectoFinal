package Corba.Donaciones;



public interface DonacionOperations 
{
  boolean insertarDonacion (int cedula, String nombreDonante, String tipoMascota, int numeroMascota);
  boolean actualizarDonacion (int cedula, String nombreDonante, String tipoMascota, int numeroMascota);
  boolean eliminarDonacion (int cedula);
  String consultarDonacion (int cedula);
  void shutdown ();
} // interface DonacionOperations
