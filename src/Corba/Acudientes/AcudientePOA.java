package Corba.Acudientes;


/**
* Acudientes/AcudientePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Acudiente.idl
* martes 13 de noviembre de 2018 16H11' COT
*/

public abstract class AcudientePOA extends org.omg.PortableServer.Servant
 implements Corba.Acudientes.AcudienteOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarAcudiente", new java.lang.Integer (0));
    _methods.put ("actualizarAcudiente", new java.lang.Integer (1));
    _methods.put ("eliminarAcudiente", new java.lang.Integer (2));
    _methods.put ("consultarAcudiente", new java.lang.Integer (3));
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
       case 0:  // Acudientes/Acudiente/insertarAcudiente
       {
         int identificacion = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String telefono = in.read_wstring ();
         String direccion = in.read_wstring ();
         String correo = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarAcudiente (identificacion, nombre, apellido, telefono, direccion, correo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Acudientes/Acudiente/actualizarAcudiente
       {
         int identificacion = in.read_long ();
         String nombre = in.read_wstring ();
         String apellido = in.read_wstring ();
         String telefono = in.read_wstring ();
         String direccion = in.read_wstring ();
         String correo = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarAcudiente (identificacion, nombre, apellido, telefono, direccion, correo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Acudientes/Acudiente/eliminarAcudiente
       {
         int identificacion = in.read_long ();
         boolean $result = false;
         $result = this.eliminarAcudiente (identificacion);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Acudientes/Acudiente/consultarAcudiente
       {
         int identificacion = in.read_long ();
         String $result = null;
         $result = this.consultarAcudiente (identificacion);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Acudientes/Acudiente/shutdown
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
    "IDL:Acudientes/Acudiente:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Acudiente _this() 
  {
    return AcudienteHelper.narrow(
    super._this_object());
  }

  public Acudiente _this(org.omg.CORBA.ORB orb) 
  {
    return AcudienteHelper.narrow(
    super._this_object(orb));
  }


} // class AcudientePOA
