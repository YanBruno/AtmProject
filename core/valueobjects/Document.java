package core.valueobjects;

import core.shared.ValueObject;

public class Document extends ValueObject{
    
    private String _cpf;

    public Document(String _cpf) {
        this._cpf = _cpf;
    }

    public String get_cpf() {
        return _cpf;
    }

}
