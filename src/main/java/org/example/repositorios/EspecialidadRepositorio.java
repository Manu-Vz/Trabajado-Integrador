package org.example.repositorios;
import org.example.utilidades.HibernateUtil;
import org.hibernate.Session;
import org.example.dominio.Especialidad;

import java.util.List;

public class EspecialidadRepositorio {
    private Session session = HibernateUtil.getSessionFactory().openSession();

    public void guardarEspecialidad(Especialidad nuevaEspecialidad){
        session.beginTransaction();
        session.save(nuevaEspecialidad);
        session.getTransaction().commit();
    }

    public void actualizarEspecialidad(Especialidad Especialidad) {
        session.beginTransaction();
        session.saveOrUpdate(Especialidad);
        session.getTransaction().commit();
    }

    public void eliminarEspecialidad(Especialidad Especialidad) {
        session.beginTransaction();
        session.delete(Especialidad);
        session.getTransaction().commit();
    }


    public List<Especialidad> obtenerTodasLasEspecialidads(){
        return session.createQuery("from Especialidad", Especialidad.class).list();
    }

   /* public List<Especialidad> obtenerEspecialidadsPorDNI(Integer dni){
        return session
                .createQuery("from Especialidad where dni = :dni", Especialidad.class)
                .setParameter("dni", dni)
                .list();

    }

    public void eliminarEspecialidadPorDNI(Integer dni) {
        session.beginTransaction();
        session.createQuery("delete from Especialidad where dni = :dni")
                        .setParameter("dni", dni)
                                .executeUpdate();
        session.getTransaction().commit();
    }
*/

    public void terminarConexion(){
        HibernateUtil.shutdown();
    }
}
