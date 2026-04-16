class StateElectionExecutor
{
public static void main(String [] p)
{

StateElection party = new StateElection();
boolean added = party.addPartyName("BJP");
System.out.println(added);

added = party.addPartyName("CONGRESS");
System.out.println(added);

added = party.addPartyName("JDS");
System.out.println(added);

added = party.addPartyName("DMK");
System.out.println(added);

added = party.addPartyName("Shiv sena");
System.out.println(added);

added = party.addPartyName("Comunist");
System.out.println(added);

added = party.addPartyName("Dravida Munnetra Kazhagam");
System.out.println(added);




party.getPartyName();
}
}