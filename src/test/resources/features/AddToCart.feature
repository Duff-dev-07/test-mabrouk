Feature: ajout produit au panier

    Scenario: verification fonctionnalite d'ajout de produits dans le panier

        Given utlisateur est sur la page du produit
        When utilisateur clique sur la couleur "CIEL", la taille "M" et ajouter au panier
        Then le panier affiche "CHEMISE À COL CLASSIQUE ET COUPE AMPLE" en couleur "CIEL" et taille "M" 


