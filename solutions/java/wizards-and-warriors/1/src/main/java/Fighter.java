class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }


}

// TODO: define the Warrior class

class Warrior extends Fighter{
    
    @Override
    boolean isVulnerable() {
        return false;
    }
    
    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6 ;
    }
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter{
    private boolean isSpellPrepared = false;
    @Override
    boolean isVulnerable() {
        if(isSpellPrepared)
            return false;
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return isSpellPrepared ? 12 : 3 ;
    }
    public void prepareSpell() {
        isSpellPrepared = true;
    }
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}