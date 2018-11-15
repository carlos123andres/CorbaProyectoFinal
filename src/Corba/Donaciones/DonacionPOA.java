package Corba.Donaciones;



public abstract class DonacionPOA extends org.omg.PortableServer.Servant
 implements Corba.Donaciones.DonacionOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarDonacion", new java.lang.Integer (0));
    _methods.put ("actualizarDonacion", new java.lang.Integer (1));
    _methods.put ("eliminarDonacion", new java.lang.Integer (2));
    _methods.put ("consultarDonacion", new java.lang.Integer (3));
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
       case 0:  // Donaciones/Donacion/insertarDonacion
       {
         int cedula = in.read_long ();
         String nombreDonante = in.read_wstring ();
         String tipoMascota = in.read_wstring ();
         int numeroMascota = in.read_long ();
         boolean $result = false;
         $result = this.insertarDonacion (cedula, nombreDonante, tipoMascota, numeroMascota);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Donaciones/Donacion/actualizarDonacion
       {
         int cedula = in.read_long ();
         String nombreDonante = in.read_wstring ();
         String tipoMascota = in.read_wstring ();
         int numeroMascota = in.read_long ();
         boolean $result = false;
         $result = this.actualizarDonacion (cedula, nombreDonante, tipoMascota, numeroMascota);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Donaciones/Donacion/eliminarDonacion
       {
         int cedula = in.read_long ();
         boolean $result = false;
         $result = this.eliminarDonacion (cedula);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Donaciones/Donacion/consultarDonacion
       {
         int cedula = in.read_long ();
         String $result = null;
         $result = this.consultarDonacion (cedula);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Donaciones/Donacion/shutdown
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
    "IDL:Donaciones/Donacion:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Donacion _this() 
  {
    return DonacionHelper.narrow(
    super._this_object());
  }

  public Donacion _this(org.omg.CORBA.ORB orb) 
  {
    return DonacionHelper.narrow(
    super._this_object(orb));
  }


} // class DonacionPOA
