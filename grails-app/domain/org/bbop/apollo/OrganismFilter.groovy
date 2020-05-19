package org.bbop.apollo

abstract class OrganismFilter {

    org.bbop.apollo.Organism organism

    static constraints = {
        organism nullable: false
    }
}
