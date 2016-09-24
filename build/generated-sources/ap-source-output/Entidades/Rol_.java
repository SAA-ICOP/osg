package Entidades;

import Entidades.Habilidad;
import Entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-24T00:58:55")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, Integer> idrol;
    public static volatile SingularAttribute<Rol, Date> fechabaja;
    public static volatile SingularAttribute<Rol, Date> fechaalta;
    public static volatile CollectionAttribute<Rol, Habilidad> habilidadCollection;
    public static volatile CollectionAttribute<Rol, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Rol, String> rol;

}