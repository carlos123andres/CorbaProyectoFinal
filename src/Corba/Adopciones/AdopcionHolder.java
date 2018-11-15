package Corba.Adopciones;

public final class AdopcionHolder implements org.omg.CORBA.portable.Streamable
{
  public Corba.Adopciones.Adopcion value = null;

  public AdopcionHolder ()
  {
  }

  public AdopcionHolder (Corba.Adopciones.Adopcion initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Corba.Adopciones.AdopcionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Corba.Adopciones.AdopcionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Corba.Adopciones.AdopcionHelper.type ();
  }

}
