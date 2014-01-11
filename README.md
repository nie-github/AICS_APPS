AICS_APPS
=========

This is our COS10 project. Sa pamamagitan nito pwede taung gumawa ng project kahit di tayo magkakasama and AS A TEAM!!!

*Member Roles*

Matagal ko nang napagisipan kung ano ano ung role ng bawat isa sa gagawin nating project.

Gagamit tayo ng technique na ang tawag ay MVC Architechture (For more info refer to http://i442.photobucket.com/albums/qq150/gregmalcolm/MVC.png)

Ito ay binubuo ng tatlong parts which is..

M - Model = Database, Database logic
V - View = GUI
C - Controller = EventListeners

Eto ang designation of roles

M - Winnie  ---- |
V - Jherson ---- | --- Jerome - Fixer
C - Jhed    ---- |

Ibig sabihin nito ay

===================================================================================================================

Winnie ikaw gagawa ng database, ng ActiveRecord class(Special technique para mapadali trabaho mo at ni controller)
at business logic. For example kung kailangan ni controller kuhanin ung time in at time out ni employee kailangan
maibibigay ng code mo yon!

Example pa ulit

//kunwari gumawa si jhed ng ganitong code.
x = Database.Employees.get("Jerome").daysPresent(); 
y = Database.Employees.get("Jerome").dailyRate();
Database.Employees.set("Jerome").salary(Controls.calculateSalary(x * y));

Kailangan maibigay mo yun sa pamamagitan ng code mo. Don't worry tuturuan kita(kayo). Ibig sabihin din nyan ay naka depende 
ung gawa ni Jhed sa gawa mo. Of course kung wala ka wala din magagawa si Jherson(nakadepende din sya sayo).
Ibig sabihin MALAKI ROLE MO! Well sa code mo kasi mangagaling ung information na kailangan ni Jhed para magawa nya ung
part nya. Pero kay Jherson hindi sya directly naka depende sayo pero ung gawa mo ay merong epekto sa gagawin nyang GUI.

===================================================================================================================

Jherson ikaw ung gagawa ng GUI, gumamit ka ng Netbeans tuturuan kita kung paano yun gagawin kaya don't worry. 
Hindi lang un ang role m o syempre KAILANGAN MONG GANDAHAN AT FORMALAN UNG GAWA MO!! Nakadepende din syempre si Jhed
sayo kasi di sya makakagawa ng EventListeners ng walang GUI.

===================================================================================================================

Jhed ikaw gagawa ng logic ng system. Madali lang naman trabaho mo. Kailangan mo lang lagyan ng Data from the model
ung view na isinupply ni Jherson, Lagyan ng data ung Model nangalling sa View, At kuhanin ung barcode galing kay
Jherson or kay Winnie. Ibig sabihin since tamad ka ikaw laging huling gagawa.

===================================================================================================================

Ako naman magaaral kung paano kakanain ung barcode at ituturo ko sainyo, and fixer.

===================================================================================================================

*Git Branches*

Kung mapapansin nyo sa github may limang branch ung project natin. master, Model, View, Controller, Fixer.

Ibig sabihin lang nyan ay kada isa sainyo may isang branch na gagawin. Lahat ng gawa nyo duon nyo i commit.

Ngaun naman kung magtataka kayo "Paano magsasama sama ung gawa namin?" Simple lang may mag memerge ng mga codes nyo.
Aku na gagawa nun tulungan nyo na lang ako kasi di ako magaling mag debug ng code ng ibang tao. 

Si Fixer kung may papasok pa saatin na isang tao sya gagawa nyan. Anu gagawin nya? Madali lang, lahat ng ipapagawa
natin gagawin nya kunwari magugutom tayo pabilhin natin sya ng pagkain etc etc.

Joke lang sakanya muna dadaan ung merging process bago sakin, sakanya na din daaan ung documentation.

===================================================================================================================

*Lets get started*

Bago ang lahat magdownload muna kayo ng https://msysgit.googlecode.com/files/Git-1.8.5.2-preview20131230.exe

then mag sign in kayo sa github.com then magpa lista kayo sakin.

Install next next next.

Tapos open nyo ung GitBash search nyo sa start menu.

lalabas ung cli nung eun.

Tapos i register nyo ung sarili nyo sa git type nyo sa cli

$git config --global user.name "Your Name Here for example Jherson V. Dela Cruz"
$git config --global user.email "Ung same email na ginamit nyo nung nag register kayo sa github"

tapos kuhanin nyo ung copy ng branch nyo sa github

$git clone -b urBranch https://github.com/jeromea33/AICS_APPS.git

kung may errors tignan nyo kung may internet kayo or kung baliktad ba ung mga slash or not

tapos tignan nyo ung git status nyo

$git status

dapat up to date lalabas jan..


