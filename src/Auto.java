public class Auto {
    public Auto(String marca, String nome, String targa, int fuel, int kmperliter) {
        this.marca = marca;
        this.nome = nome;
        this.targa = targa;
        this.fuel = fuel;
        this.kmperliter = kmperliter;
    }
    public String getMarca()
    {
        return marca;
    }
    public String getNome()
    {
        return nome;
    }
    public String getTarga()
    {
        return targa;
    }
    public int getFuel()
    {
        return fuel;
    }
    public int getKmperliter()
    {
        return kmperliter;
    }
    public int calcAutonomy()
    {
        return fuel*kmperliter;
    }
    private final String marca;
    private final String nome;
    private final String targa;
    private final int fuel;
    private final int kmperliter;
}