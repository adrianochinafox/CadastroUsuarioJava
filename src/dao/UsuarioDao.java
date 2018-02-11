package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.UsuarioModel;

/**
 *
 * @author adrianoabrantesdeandrade
 */
public class UsuarioDao {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Cadastro_UsuariosPU");
        return factory.createEntityManager();
    }

    public UsuarioModel salvar(UsuarioModel usuarioModel) {
        EntityManager em = getEM();

        try {
            em.getTransaction().begin();
            em.persist(usuarioModel);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();

        } finally {
            em.close();
        }

        return usuarioModel;
    }
    
    public void excluir(UsuarioModel usuarioModel){
        EntityManager em = getEM();
        
        em.getTransaction().begin();
        em.remove(em);
        
    }
}
