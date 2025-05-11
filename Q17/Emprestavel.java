interface Emprestavel {
    boolean emprestar(Usuario usuario) throws MaterialIndisponivelException;
    boolean devolver(Usuario usuario);
}