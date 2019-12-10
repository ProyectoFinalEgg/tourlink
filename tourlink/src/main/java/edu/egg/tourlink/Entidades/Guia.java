package edu.egg.tourlink.Entidades;

import edu.egg.tourlink.Enumeraciones.Disponibilidad_dia;
import edu.egg.tourlink.Enumeraciones.Disponibilidad_turno;
import edu.egg.tourlink.Enumeraciones.Estado;
import edu.egg.tourlink.Enumeraciones.Sexo;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Guia {
    // Atributos
    @Id
    private long dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private long telefono;
    private String educacion;
    private String experiencia;
    private String extracto;
    private String rrss_facebook;
    private String rrss_instagram;
    private String rrss_linkedin;
    private String clave;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    
    @Enumerated(EnumType.STRING)  // F, M, Otro
    private Sexo sexo;
    @Enumerated(EnumType.STRING)  // lun, mar, mier, jue, vie, sab, dom
    private Disponibilidad_dia disponibilidad_dia; 
    @Enumerated(EnumType.STRING)  // HD Mañana, HD Tarde, FD
    private Disponibilidad_turno disponibilidad_turno;
    @Enumerated(EnumType.STRING)  // Activo o inactivo
    private Estado estado;
    
    @OneToMany
    private List<IdiomaGuia> idiomasGuia;
    @OneToMany
    private List<Aptitud> aptitudes;
    @OneToOne
    private Foto foto;
    
    // Constructores
    public Guia(){}

    public Guia(long dni, String nombre, String apellido, String email, String direccion, long telefono, String educacion, String experiencia, String extracto, String rrss_facebook, String rrss_instagram, String rrss_linkedin, Date fechaNacimiento, Sexo sexo, Disponibilidad_dia disponibilidad_dia, Disponibilidad_turno disponibilidad_turno, Estado estado, List<IdiomaGuia> idiomasGuia, List<Aptitud> aptitudes) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.educacion = null;
        this.experiencia = null;
        this.extracto = null;
        this.rrss_facebook = null;
        this.rrss_instagram = null;
        this.rrss_linkedin = null;
        this.fechaNacimiento = null;
        this.sexo = null;
        this.disponibilidad_dia = null;
        this.disponibilidad_turno = null;
        this.estado = null;
        this.idiomasGuia = null;
        this.aptitudes = null;
    }
    
    
    // Getter & Setter
    
    /**
     * @return the dni
     */
    public long getDni() {
        return dni;
    }
    
    /**
     * @param dni the dni to set
     */
    public void setDni(long dni) {
        this.dni = dni;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the educacion
     */
    public String getEducacion() {
        return educacion;
    }

    /**
     * @param educacion the educacion to set
     */
    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    /**
     * @return the experiencia
     */
    public String getExperiencia() {
        return experiencia;
    }

    /**
     * @param experiencia the experiencia to set
     */
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    /**
     * @return the extracto
     */
    public String getExtracto() {
        return extracto;
    }

    /**
     * @param extracto the extracto to set
     */
    public void setExtracto(String extracto) {
        this.extracto = extracto;
    }

    /**
     * @return the rrss_facebook
     */
    public String getRrss_facebook() {
        return rrss_facebook;
    }

    /**
     * @param rrss_facebook the rrss_facebook to set
     */
    public void setRrss_facebook(String rrss_facebook) {
        this.rrss_facebook = rrss_facebook;
    }

    /**
     * @return the rrss_instagram
     */
    public String getRrss_instagram() {
        return rrss_instagram;
    }

    /**
     * @param rrss_instagram the rrss_instagram to set
     */
    public void setRrss_instagram(String rrss_instagram) {
        this.rrss_instagram = rrss_instagram;
    }

    /**
     * @return the rrss_linkedin
     */
    public String getRrss_linkedin() {
        return rrss_linkedin;
    }

    /**
     * @param rrss_linkedin the rrss_linkedin to set
     */
    public void setRrss_linkedin(String rrss_linkedin) {
        this.rrss_linkedin = rrss_linkedin;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the disponibilidad_dia
     */
    public Disponibilidad_dia getDisponibilidad_dia() {
        return disponibilidad_dia;
    }

    /**
     * @param disponibilidad_dia the disponibilidad_dia to set
     */
    public void setDisponibilidad_dia(Disponibilidad_dia disponibilidad_dia) {
        this.disponibilidad_dia = disponibilidad_dia;
    }

    /**
     * @return the disponibilidad_turno
     */
    public Disponibilidad_turno getDisponibilidad_turno() {
        return disponibilidad_turno;
    }

    /**
     * @param disponibilidad_turno the disponibilidad_turno to set
     */
    public void setDisponibilidad_turno(Disponibilidad_turno disponibilidad_turno) {
        this.disponibilidad_turno = disponibilidad_turno;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * @return the idiomasGuia
     */
    public List<IdiomaGuia> getIdiomasGuia() {
        return idiomasGuia;
    }

    /**
     * @param idiomasGuia the idiomasGuia to set
     */
    public void setIdiomasGuia(List<IdiomaGuia> idiomasGuia) {
        this.idiomasGuia = idiomasGuia;
    }

    /**
     * @return the aptitudes
     */
    public List<Aptitud> getAptitudes() {
        return aptitudes;
    }

    /**
     * @param aptitudes the aptitudes to set
     */
    public void setAptitudes(List<Aptitud> aptitudes) {
        this.aptitudes = aptitudes;
    }

    /**
     * @return the foto
     */
    public Foto getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}

