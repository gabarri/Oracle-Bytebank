package com.bytebank.modelo;

public class Cliente implements Autenticable {

	// Public es el mas accesible
<<<<<<< HEAD
	// Protected j
=======
	// Protected j
>>>>>>> fa23d831f80c80f398fbf15eafb46b1729ff3503
	
	private String nombre;
    private String documento;
    private String telefono;

    private AutenticacionUtil util;

    public Cliente() {
        this.util = new AutenticacionUtil();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);
    }
}
