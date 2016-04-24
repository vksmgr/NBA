package mgr.vikas.login;

import mgr.vikas.database.Connection;

import java.util.Iterator;
import java.util.List;

/**
 * Created by A on 30-03-2016.
 */

public class Login {

    public void register(String l_id, String m_username, String m_password, String m_acc_avctivation, String m_level){
       // Connection.connect();
        M_Login m_login = new M_Login();
        m_login.set("m_id_login",l_id);
        m_login.set("m_username", m_username);
        m_login.set("m_password", m_password);
        m_login.set("m_acc_activation", m_acc_avctivation);
        m_login.set("m_level", m_level);
        m_login.saveIt();
        System.out.println("success..!");
        Connection.close();
    }

    public Boolean checkIfExit(M_Login m_login){
        if(m_login == null){
          return false;
        }else {
            return true;
        }
    }
    public String loginMe(String username, String password){
        String myName = null;
        M_Login m_login_o = null;
        List<M_Login> m_login = M_Login.findBySQL("select m_level from m_logins where m_username = '"+username+"' AND m_password = '"+password+"' AND m_acc_activation ='1'");
        //m_login_o=m_login.get(1);
        //interating over a list objects.
       // System.out.println("i'm Here === Debug : "+m_login );
        Iterator<M_Login> m_loginIterator = m_login.iterator();
        while (m_loginIterator.hasNext()){
            m_login_o = m_loginIterator.next();
            //System.out.println(m_login_o);
        }
        if(checkIfExit(m_login_o)){
            return m_login_o.get("m_level").toString();
        }else{
            return "0";
        }

    }
}
