enum Tipo_Combustivel {
    GASOLINA(quantidade_maxima_litros:20),
    ALCOOL,
    DIESEL

    private float quantidade_maxima_litros; 

    private Tipos_Combustivel(float quantidade_maxima_litros) {
        this.quantidade_maxima_litros = Tipo_Combustivel.quantidade_maxima_litros;
        
    }
}
