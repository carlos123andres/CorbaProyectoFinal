package Corba.Adopciones;



public abstract class AdopcionPOA extends org.omg.PortableServer.Servant
 implements Corba.Adopciones.AdopcionOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarAdopcion", new java.lang.Integer (0));
    _methods.put ("actualizarAdopcion", new java.lang.Integer (1));
    _methods.put ("eliminarAdopcion", new java.lang.Integer (2));
    _methods.put ("consultarAdopcion", new java.lang.Integer (3));
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
       case 0:  // Adopciones/Adopcion/insertarAdopcion
       {
         int cedula = in.read_long ();
         int idMascota = in.read_long ();
         String nombre = in.read_wstring ();
         String direccion = in.read_wstring ();
         String correo = in.read_wstring ();
         String nacionalidad = in.read_wstring ();
         int edad = in.read_long ();
         boolean $result = false;
         $result = this.insertarAdopcion (cedula, idMascota, nombre, direccion, correo, nacionalidad, edad);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Adopciones/Adopcion/actualizarAdopcion
       {
         int cedula = in.read_long ();
         int idMascota = in.read_long ();
         String nombre = in.read_wstring ();
         String direccion = in.read_wstring ();
         String correo = in.read_wstring ();
         String nacionalidad = in.read_wstring ();
         int edad = in.read_long ();
         boolean $result = false;
         $result = this.actualizarAdopcion (cedula, idMascota, nombre, direccion, correo, nacionalidad, edad);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Adopciones/Adopcion/eliminarAdopcion
       {
         int cedula = in.read_long ();
         boolean $result = false;
         $result = this.eliminarAdopcion (cedula);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Adopciones/Adopcion/consultarAdopcion
       {
         int cedula = in.read_long ();
         String $result = null;
         $result = this.consultarAdopcion (cedula);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Adopciones/Adopcion/shutdown
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
    "IDL:Adopciones/Adopcion:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Adopcion _this() 
  {
    return AdopcionHelper.narrow(
    super._this_object());
  }

  public Adopcion _this(org.omg.CORBA.ORB orb) 
  {
    return AdopcionHelper.narrow(
    super._this_object(orb));
  }


} // class AdopcionPOA
