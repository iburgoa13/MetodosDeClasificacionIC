package Logic;

public class Elementos {
    private double[] _list;
    private String _name;

    public Elementos(double[] l, String n){
        _list = l;
        _name = n;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }

    public double[] get_list() {
        return _list;
    }

    public void set_list(double[] _list) {
        this._list = _list;
    }
    public String getListString(){
        String x="";
        for(double n : _list){
            x+=n+" ";
        }
        return x;
    }
}
