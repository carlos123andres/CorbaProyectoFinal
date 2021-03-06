package Pesos;


/**
* Pesos/PesoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Peso.idl
* martes 13 de noviembre de 2018 14H41' COT
*/

public abstract class PesoPOA extends org.omg.PortableServer.Servant
 implements Pesos.PesoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarPeso", new java.lang.Integer (0));
    _methods.put ("actualizarPeso", new java.lang.Integer (1));
    _methods.put ("eliminarPeso", new java.lang.Integer (2));
    _methods.put ("consultarPeso", new java.lang.Integer (3));
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
       case 0:  // Pesos/Peso/insertarPeso
       {
         int id = in.read_long ();
         String apodo = in.read_wstring ();
         String fecha = in.read_wstring ();
         String peso = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarPeso (id, apodo, fecha, peso);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Pesos/Peso/actualizarPeso
       {
         int id = in.read_long ();
         String apodo = in.read_wstring ();
         String fecha = in.read_wstring ();
         String peso = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarPeso (id, apodo, fecha, peso);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Pesos/Peso/eliminarPeso
       {
         int id = in.read_long ();
         boolean $result = false;
         $result = this.eliminarPeso (id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Pesos/Peso/consultarPeso
       {
         int id = in.read_long ();
         String $result = null;
         $result = this.consultarPeso (id);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Pesos/Peso/shutdown
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
    "IDL:Pesos/Peso:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Peso _this() 
  {
    return PesoHelper.narrow(
    super._this_object());
  }

  public Peso _this(org.omg.CORBA.ORB orb) 
  {
    return PesoHelper.narrow(
    super._this_object(orb));
  }


} // class PesoPOA
