package Corba.Donaciones;


public final class DonacionHolder implements org.omg.CORBA.portable.Streamable
{
  public Corba.Donaciones.Donacion value = null;

  public DonacionHolder ()
  {
  }

  public DonacionHolder (Corba.Donaciones.Donacion initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Corba.Donaciones.DonacionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Corba.Donaciones.DonacionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Corba.Donaciones.DonacionHelper.type ();
  }

}
