interface ExportadorRelatorio {
    String exportar(String titulo, String conteudo) throws ExportacaoFalhouException;
}