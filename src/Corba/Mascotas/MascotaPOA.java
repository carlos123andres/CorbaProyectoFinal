package Mascotas;


/**
* Mascotas/MascotaPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Mascota.idl
* martes 13 de noviembre de 2018 13H48' COT
*/

public abstract class MascotaPOA extends org.omg.PortableServer.Servant
 implements Mascotas.MascotaOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarMascota", new java.lang.Integer (0));
    _methods.put ("actualizarMascota", new java.lang.Integer (1));
    _methods.put ("eliminarMascota", new java.lang.Integer (2));
    _methods.put ("consultarMascota", new java.lang.Integer (3));
    _methods.put ("shutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Mascotas/Mascota/insertarMascota
       {
         int codigo = in.read_long ();
         String apodo = in.read_wstring ();
         String especie = in.read_wstring ();
         String raza = in.read_wstring ();
         String colorPelo = in.read_wstring ();
         String fechaNacimiento = in.read_wstring ();
         int numeroVacuna = in.read_long ();
         String nombreVacuna = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarMascota (codigo, apodo, especie, raza, colorPelo, fechaNacimiento, numeroVacuna, nombreVacuna);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Mascotas/Mascota/actualizarMascota
       {
         int codigo = in.read_long ();
         String apodo = in.read_wstring ();
         String especie = in.read_wstring ();
         String raza = in.read_wstring ();
         String colorPelo = in.read_wstring ();
         String fechaNacimiento = in.read_wstring ();
         int numeroVacuna = in.read_long ();
         String nombreVacuna = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarMascota (codigo, apodo, especie, raza, colorPelo, fechaNacimiento, numeroVacuna, nombreVacuna);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Mascotas/Mascota/eliminarMascota
       {
         int codigo = in.read_long ();
         boolean $result = false;
         $result = this.eliminarMascota (codigo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Mascotas/Mascota/consultarMascota
       {
         int codigo = in.read_long ();
         String $result = null;
         $result = this.consultarMascota (codigo);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Mascotas/Mascota/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Mascotas/Mascota:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Mascota _this() 
  {
    return MascotaHelper.narrow(
    super._this_object());
  }

  public Mascota _this(org.omg.CORBA.ORB orb) 
  {
    return MascotaHelper.narrow(
    super._this_object(orb));
  }


} // class MascotaPOA
