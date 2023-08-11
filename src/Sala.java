public class Sala {
    Miejsce[] miejsca;
    int numerSali;

    public Sala(int numerSali) {
        this.numerSali = numerSali;
        miejsca = new Miejsce[5];
        miejsca[0] = new Miejsce();
        miejsca[1] = new Miejsce();
        miejsca[2] = new Miejsce();
        miejsca[3] = new Miejsce();
        miejsca[4] = new Miejsce();

    }

    public void rezerwujMiejsce() {
        for (int i = 0; i < miejsca.length; i++ ) {
            if (!miejsca[i].zajete) {//po zwolnieniu miejsc nie wiemy, które są zajęte
                miejsca[i].zajete = true;
                System.out.println("Zarezerwowano miejsce " + i + " w sali " + numerSali);
                break;
            }
//                else {
//                System.out.println("Miejsce " + i + " w sali " + numerSali + " jest już zajęte.");
//            }
        }
    }

    public void zwolnijMiejsce(int i) {
        if (i >= miejsca.length) {
            System.out.println("Nie ma takiego miejsca");
        }
        else {
            if (miejsca[i].zajete == true) {
                System.out.println("Zwalniam miejsce " + i );
                miejsca[i].zajete = false;
                }
            else System.out.println("Miejsce nie bylo zajete");
            }
        }


    }

