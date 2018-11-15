package Corba.Adopciones;


public class _AdopcionStub extends org.omg.CORBA.portable.ObjectImpl implements Corba.Adopciones.Adopcion
{

  public boolean insertarAdopcion (int cedula, int idMascota, String nombre, String direccion, String correo, String nacionalidad, int edad)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarAdopcion", true);
                $out.write_long (cedula);
                $out.write_long (idMascota);
                $out.write_wstring (nombre);
                $out.write_wstring (direccion);
                $out.write_wstring (correo);
                $out.write_wstring (nacionalidad);
                $out.write_long (edad);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarAdopcion (cedula, idMascota, nombre, direccion, correo, nacionalidad, edad        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarAdopcion

  public boolean actualizarAdopcion (int cedula, int idMascota, String nombre, String direccion, String correo, String nacionalidad, int edad)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarAdopcion", true);
                $out.write_long (cedula);
                $out.write_long (idMascota);
                $out.write_wstring (nombre);
                $out.write_wstring (direccion);
                $out.write_wstring (correo);
                $out.write_wstring (nacionalidad);
                $out.write_long (edad);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarAdopcion (cedula, idMascota, nombre, direccion, correo, nacionalidad, edad        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarAdopcion

  public boolean eliminarAdopcion (int cedula)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarAdopcion", true);
                $out.write_long (cedula);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarAdopcion (cedula        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarAdopcion

  public String consultarAdopcion (int cedula)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarAdopcion", true);
                $out.write_long (cedula);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarAdopcion (cedula        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarAdopcion

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Adopciones/Adopcion:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _AdopcionStub
