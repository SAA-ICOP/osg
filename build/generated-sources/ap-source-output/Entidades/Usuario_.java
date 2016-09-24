package Entidades;

import Entidades.Rol;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-24T00:58:55")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> nombreusuario;
    public static volatile SingularAttribute<Usuario, String> passusuario;
    public static volatile SingularAttribute<Usuario, Date> fechabaja;
    public static volatile SingularAttribute<Usuario, Date> fechacreacion;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, Rol> rolIDROL;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;

}