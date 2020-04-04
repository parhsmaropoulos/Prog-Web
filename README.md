# Prog-Web

ΠΡΟΓΡΑΜΜΑΤΙΣΜΟ΅ΣΤΟ ΔΙΑΔΙΚΤΥΟ ΚΑΙ ΤΟΝ ΠΑΓΚΟΣΜΙΟ ΙΣΤΟ
ΜΑΡΟΠΟΥΛΟΣ ΠΑΡΑΣΚΕΥΑΣ
Π15086
ΜΆΡΤΙΟΣ 2020
Το πρόγραμμα αφορά μια εφαρμογή έκδοσης λογαριασμών και διαχείρισης πελατών κινητής
τηλεφωνίας.Στο έγγραφο αυτό βρίσκονται οι κλάσεις και οι μέθοδοι για το πρώτο μέρος της
εργασίας.
!!Είναι πιθανό κάποιες μέθοδοι ή/και κλάσεις να αλλάξουν στην συνέχεια για να είναι καλύτερα
δομημένο το πρόγραμμα και να εξυπηρετηθούν περαιτέρω ανάγκες που ίσως προκύψουν.
Κλάσεις:
Admin:
Γενική Περιγραφή: Αφορά το αντικείμενο Admin(διαχειριστής) της εφαρμογής και
τις δυνατότητες/ δράσεις που μπορεί να κάνει
Μεταβλητές:
List<Program> Programs `Λίστα με τα υπάρχοντα
προγράμματα(τύπου Program)`
Μέθοδοι:
CreateUser(): Users `Δημιουργία ενός αντικειμένου Users το οποίο το
επιστρέφει.`
ShowPrograms(): void `Εμφάνιση της λίστας Programs σε μορφή JSON`
DeleteUser(): void `Διαγραφή ενος αντικειμένου Users`
CreateProgram(): void `Δημιουργία αντικειμένου Program`
DeleteProgram(): void `Διαγραφή αντικειμένου Program`
Get/Set()
Bill:
Γενική Περιγραφή: Τα αντικείμενα Bill είναι οι λογαριασμοί των χρηστών.
Μεταβλητές:
float Price `Τιμή`
String Month `Μήνας έκδοσης`
Int PhoneNumber `Αριθμός δικαιούχου`
Μέθοδοι:
Get/Set()
Call:
Γενική Περιγραφή:
Περιγραφή και στοιχεία μιας κλήσης
Μεταβλητές:
int Time `χρόνος ομηλίας`
Int FromNumber `Ποιό νούμερο έκανε την κλήση`
Int toNumber `Ποιό νούμερο δέχτηκε την κλήση`
Μέθοδοι:
makeCall(int, int):void `Εκτέλεση της κλήσης`
alterProgram(int):void `Ανανέωση του προγράμματος(π.χ. χρέωση) του
ατόμου όπου έκανε την κλήση`
Get/Set
Client:
Γενική Περιγραφή: Περιγραφή του αντικειμένου Client(πελάτης) και οι
δυνατότητές του.
Μεταβλητές:
Int AFM `Αριθμός μητρώου που εκδίδεται την στιγμή που καταχωρείται
ως πελάτης και μετά δεν αλλάζει`
Int PhoneNumber `Αριθμός τηλεφώνου`
List<Call> CallHistory `Το ιστορικό των κλήσεων του πελάτη`
List<Bill> Bills `Ολοι οι λογαριασμοί του πελάτη μέχρι στιγμής`
List<Bill> CompletedBills
Μέθοδοι:
GetDetails(Client):void `προβολή στοιχείων του πελάτης σε μορφή JSON`
MakeCall(int,int): void `δημιουργία και εκτέλεση κλήσης`
ShowBills(): void `Εμφάνιση όλων των λογαριασμών`
ShowCompletedBills():void `Εμφάνιση των πληρωμένων λογαριασμών`
addBill(Bill): void `Προσθήκη ενός λογαριασμού`
ShowUnCompletedBills():void `Εμφάνιση των μη πληρωμένων
λογαριασμών`
CallHistory():void `Εμφάνιση ιστορικού κλήσεων`
Get/Set
createUser:
Γενική Περιγραφή: Προσωρινή κλάση για την εκτέλεση των λειτουργιών του
προγράμματος μέχρι να δημιουργηθεί το αντίστοιχο GUI.
Μεταβλητές:
List<Users> userList
Μέθοδοι:
showUsers():void `Προβολή των εγγεγραμένων χρηστών`
main():void `Έναρξη του προγράμματος`
LogIn(): Users `Σύνδεση του χρήστη`
LogInMenu(Users): void `Μενού επιλογών χρήστη ανάλογα τα δικαιώματα
του`
Register(): void `Εγγραφή χρήστη)
Message:
Γενική Περιγραφή: Περιγραφή του αντικειμένου Message(μήνυμα)
Μεταβλητές:
Int From `Νούμερο αποστολέα`
Int To `Νούμερο δέχτη`
Μέθοδοι:
Get/Set
sentMessage():void `Αποστολή μυνήματος`
alterProgram(): void
PhoneNumber:
Γενική Περιγραφή: Περιγραφή αντικειμένου PhoneNumber(αριθμός τηλεφώνου)
Μεταβλητές:
Int phoneNumber `Αριθμός τηλεφώνου`
Int programID `αριθμός αναγνώρισης προγράμματος που έχει το
αντίστοιχο νούμερο`
Μέθοδοι:
Get/Set
GeneratePhoneNumber():int `Έκδοση αριθμού τηλεφώνου`
Program:
Γενική Περιγραφή: Περιγραφή αντικειμένου Program(προγράμματος)
τηλεφωνικής εταιρίας
Μεταβλητές:
// Στοιχεία αναγνώρισης
String Name `Όνομα προγράμματος `
int ID `Αριθμός αναγνώρισης`
// Χαρακτηριστικά προγράμματος - παροχές
int FreeCallsPerMonth `Αριθμός δωρεάν κλήσεων ανα μήνα`
int FreeMessagesPerMonth `Αριθμός δωρεάν μηνυμάτων ανα μήνα`
Boolean CanCallAbroad `Επιτρέπεται να καλέσει εξωτερικό ή όχι`
// Χρεώσεις
int PricePerMonth `Τιμή πακέτου το μήνα`
int PricePerCall `Τιμή ανα κλήση εφόσον περάσει το όριο των δωρεάν
κλήσεων`
int PricePerMessage `Τιμή ανα μήνυμα εφόσον περάσει το όριο των
δωρεάν μηνυμάτων`
*** int TotalChargeThisMonth ***
Μέθοδοι:
Get/Set
AddCharge(): void ***
ResetCharge():void ***
PsqlCon:
Γενική Περιγραφή: Η κλάση αυτή περιέχει όλες τι μεθόδους που χρειάζεται η
εφαρμογή για την σύνδεση με την βάσης δεδομένων(στην περίπτωση αυτή PostgreSQL)
Μεταβλητές:
Μέθοδοι:
main(): void `Εγκατάσταση της σύνδεσης με την βάση δεδομένων`
Seller:
Γενική Περιγραφή: Περιγραφή αντικειμένου Seller(Πωλητής) και οι μέθοδοί του`
Μεταβλητές:
ArrayList<String> ClientNames `Λίστα ονομάτων που εξυπηρετή ο κάθε
πωλητής`
Μέθοδοι:
AddUser(): Users `δημιουργία αντικειμένου User`
BillIssue(Client,String,float): Bill `Έκδοση λογαριασμού για τον
συγκεκριμένο πελάτη`
changePackage(String,String,String): void `Αλλαγή πακέτου στον
εισαγόμενο αριθμό`
Users:
Γενική Περιγραφή: Γενική κλάση User(χρήστη)
Μεταβλητές:
String username `Username χρήστη`
String name `όνομα χρήστη`
String surname `επόνυμο χρήστη`
String type `τύπος χρήστη(Client, Seller, Admin)`
Boolean loggedin `Έλεγχος σύνδεσης`
Int userCounter `Αριθμος εγγεγραμμένων χρηστών`
Μέθοδοι:
Login(String,Boolean):void `Είσοδος χρήστη στην εφαρμογή`
Logout(String,Boolean):void `Έξοδος χρήστη από την εφαρμογή`
Register(String,String, String, String):void `Εγγραφή χρήστη στην
εφαργμογή`
