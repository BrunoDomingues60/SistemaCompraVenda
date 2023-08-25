package view;

import javax.swing.*;
import java.awt.*;

public class ViewLogin extends JFrame implements interfaces.InterfaceGUI {
    
    private JLabel lbl_usuario, lbl_senha, lbl_titulo;
    private JPanel painel_login;
    
    public ViewLogin(){
        setTitle("Login");
        setPreferredSize(new Dimension(1080, 780));
        setLayout(null);
        
        instanciar();
        adicionar();
        posicionar();
    }
    
    public static void main(String[] args) {

    }

    @Override
    public void instanciar() {
        instanciarLogin();
    }

    @Override
    public void adicionar() {
        adicionarLogin();
    }

    @Override
    public void posicionar() {
        posicionarLogin();
    }

    @Override
    public void tratarEventos() {
    }

    private void instanciarLogin() {
        lbl_usuario = new JLabel("Usuário");
        lbl_senha = new JLabel("Senha");
        lbl_titulo = new JLabel("Sistema Compra & Venda");
        painel_login = new JPanel();
    }

    private void adicionarLogin() {
        painel_login.add(lbl_usuario);
        painel_login.add(lbl_senha);
        painel_login.add(lbl_titulo);
    }

    private void posicionarLogin() {
        
    }
}
