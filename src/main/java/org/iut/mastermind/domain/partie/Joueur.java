package org.iut.mastermind.domain.partie;

public record Joueur(String nom) {

    public String getNom() {
        return this.nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Joueur autre = (Joueur) o;
        return nom.equals(autre.nom);
    }

}
