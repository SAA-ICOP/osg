package Entidades;

import Entidades.Rol;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-24T00:58:55")
@StaticMetamodel(Habilidad.class)
public class Habilidad_ { 

    public static volatile SingularAttribute<Habilidad, Integer> idhabilidad;
    public static volatile SingularAttribute<Habilidad, Date> fechabaja;
    public static volatile SingularAttribute<Habilidad, Date> fechaalta;
    public static volatile SingularAttribute<Habilidad, String> habilidad;
    public static volatile CollectionAttribute<Habilidad, Rol> rolCollection;

}