# ProjectFitnessGym
Proiect - Sală de fitness 
Se va crea o aplicație ce are ca scop gestiunea oamenilor ce se antrenează într-o sală de fitness.
Există două tipuri de persoane ce pot intra în sală: antrenori și abonați. Pentru orice persoană se reține numele, vârsta și un id de tip int, unic. Pentru un antrenor se mai salvează numărul de abonați pe care îi are, iar pentru un abonat se reține progresul făcut, sub forma unei valori din intervalul [0,10]. 
Pentru ca oamenii sa aibă mai mult loc, se impun niște restricții și se anunța ca în sală pot fi prezenți, la orice moment de timp, maximum 3 persoane. Aplicația va crea o singură sală de fitness care trebuie să implementeze următoarele funcționalități:
✔	Intrarea unei persoane în sală
✔	Ieșirea unei persoane din sală
✔	Afișarea tuturor persoanelor din sală
✔	Afișarea antrenorilor
✔	Afișarea abonatului cu cel mai mare progres
Dacă se încearcă scoaterea din sală a unei persoane care nu există, se va arunca o excepție de tip checked numită PersoanaNuExista, care va fi tratată, afișându-se un mesaj corespunzător, astfel încât aplicația să poată continua. 
Pentru început, implementati o clasa abstractă Persoana care contine toate campurile de mai sus (nume, varsta, id). Aceasta clasa va fi mostenita de clasa Antrenor care adaugă nrAbonati și de clasa Abonat care adauga progres (număr cuprins între [0, 10]). De asemenea, adaugati cate un constructor care sa primească și sa seteze aceste campuri, mai puțin campul id care va fi setat din clasa Persoana (cu ajutorul unui contor static, care crește la fiecare instanțiere).
Sala de fitness este reprezentată de o clasa SalaFitness care are un array de persoane reprezentand persoanele care sunt la un moment dat în sală și un camp care indica dacă sala este deschisa sau nu. Aceasta clasa are următoarele comportamente private:
●	deschideSala - afișează un mesaj corespunzător și seteaza campul potrivit (care indica dacă este sau nu deschisa)
●	adaugaAntrenor - care primește un nume, varsta, numărul de abonați -  marchează intrarea unui antrenor în sală. Dacă locurile sunt ocupate, se va afișa: “Din păcate, sala este plină și ” + nume “ nu mai poate intra”, altfel se va afișa “A intrat în sală antrenorul ” + nume. Aceasta metodă adăuga un obiect de tip Antrenor în array-ul de persoane pe prima poziție care are null (dacă există) și incrementeaza numărul de persoane
●	adaugaAbonat - care primește un nume, varsta, progresul -  marchează intrarea unui abonat în sală. Dacă locurile sunt ocupate, se va afișa: “Din păcate, sala este plină și ” + nume “ nu mai poate intra”, altfel se va afișa “A intrat în sală abonatul ” + nume. Aceasta metodă adăuga un obiect de tip Abonat în array-ul de persoane pe prima poziție care are null (dacă există) și incrementeaza numărul de persoane
●	afiseazaPersoane - afișează toate persoanele din sală. Dacă nu există nici o persoană, se va afișa mesajul: ”Sala este liberă!”
●	afiseazaAntrenori - afișează toți antrenorii din sală (din array). Dacă nu există, se va afișa mesajul: ”Nu există niciun antrenor în sală!”
●	afiseazaAbonatCuProgresMax - afișează abonatul care are cel mai mare progres, dacă nu există se va afișa “Nu există niciun abonat în sală!”
●	eliminaPersoana - scoate persoane cu id-ul primit din sala dacă aceasta există (pune null în array pe poziția pe care se afla persoana)
●	inchide() - afișează un mesaj corespunzător și seteaza campul potrivit care indica dacă sala este deschisa sau nu
În acest proiect există și un enum Acțiune cu toate acțiunile descrise mai sus: DESCHIDE, ADAUGA_ANTRENOR, ADAUGA_ABONAT, AFISEAZA_PERSOANE, AFISEAZA_ANTRENORI, AFISEAZA_ABONAT_MAX, ELIMINA_PERSOANA, INCHIDE.
SalaFitness are o metodă acțiune(Acțiune acțiune) care primește o constanta din enum-ul de mai sus și pentru fiecare apelează metoda corespunzătoare cu parametrii corespunzători. Dacă acțiunea primită este ADAUGA_ANTRENOR, atunci se apeleaza adaugaAntrenor() și pentru parametrii puteți sa folosiți ClasaUtilitara (care se afla în folderul proiect, unde este și acest document). Aceasta ClasaUtilitara are 5 metode statice care genereaza un număr random (pentru varsta, progres, număr abonați sau id) și un nume random (folosit pentru numele Persoanelor). 
Hint: ClasaUtilitara poate fi folosită:
adaugaAntrenor(ClasaUtilitara.genereazaNume(), ClasaUtilitara.genereazaVarsta(), ClasaUtilitara.genereazaNrAbonati());

Dacă se încearcă folosirea oricărui comportament (exceptand deschide()) în metodă acțiune() și sala nu este deschisa atunci se arunca excepția de tip unchecked - SalaInchisa.
Implementați o clasa care sa aiba metodă main și array-ul:
Actiune[] actiuni = {Actiune.DESCHIDE, Actiune.AFISEAZA_PERSOANE, Actiune.ADAUGA_ABONAT, Actiune.ADAUGA_ANTRENOR, Actiune.ADAUGA_ABONAT,
   Actiune.ADAUGA_ANTRENOR, Actiune.AFISEAZA_PERSOANE, Actiune.AFISEAZA_ANTRENORI, Actiune.AFISEAZA_ABONAT_MAX, Actiune.ELIMINA_PERSOANA,
       Actiune.AFISEAZA_PERSOANE, Actiune.ADAUGA_ANTRENOR, Actiune.AFISEAZA_PERSOANE, Actiune.INCHIDE};

Parcurgeți array-ul cu un for-each și apelați pe un obiect de tipul SalaFitness toate acțiunile.
Un alt array cu ajutorul căruia puteți sa testați că nu se executa nicio acțiune fără ca sala sa fie deschisa: Actiune[] actiuni = {Actiune.AFISEAZA_PERSOANE};
