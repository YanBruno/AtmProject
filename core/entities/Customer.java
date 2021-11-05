package core.entities;

import java.util.ArrayList;
import core.shared.Entity;
import core.valueobjects.Document;
import core.valueobjects.Name;

public class Customer extends Entity{
    
    private Name _name;
    private Document _document;
    private String _senha;
    private ArrayList<Conta> _contas;
    
    public Customer(Name _name, Document _document, String _senha) {
        this._name = _name;
        this._document = _document;
        this._senha = _senha;
        this._contas = new ArrayList<Conta>();
    }
    
    public void AddConta(Conta conta){
        _contas.add(conta);
    }
    
    
    // GETS
    public Iterable<Conta> get_Contas(){
        return _contas;
    }
    public Name get_name() {
        return _name;
    }
    public Document get_document() {
        return _document;
    }
    public String get_senha() {
        var senha = new StringBuilder();
        for (int i = 0; i < _senha.toCharArray().length; i++) {
            senha.append("*");
        }
        return senha.toString();
    }
}
