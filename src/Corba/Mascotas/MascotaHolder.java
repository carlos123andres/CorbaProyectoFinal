package Mascotas;

/**
* Mascotas/MascotaHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Mascota.idl
* martes 13 de noviembre de 2018 13H48' COT
*/

public final class MascotaHolder implements org.omg.CORBA.portable.Streamable
{
  public Mascotas.Mascota value = null;

  public MascotaHolder ()
  {
  }

  public MascotaHolder (Mascotas.Mascota initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Mascotas.MascotaHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Mascotas.MascotaHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Mascotas.MascotaHelper.type ();
  }

}