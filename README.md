ini adalah repository pertama saya..
Nama. : Rido Febrian
NIM   : 264107020043
Kelas : 1-G

Hasil Uji Studi Kasus 2 oleh <Davyn Xyello Cristwant>
graph TD
    Start([Mulai]) --> Input[Input Jenis Kegiatan, Jumlah Dokumen, & Peringkat/Status]
    Input --> CheckKegiatan{Jenis Kegiatan?}

    CheckKegiatan -->|BAKORMA| B1{Jumlah Dokumen == 4?}
    B1 -->|Tidak (3 dokumen)| Out1[Dokumen tidak lengkap, kurang 1 dokumen. Dana penghargaan tidak diberikan]

    CheckKegiatan -->|Mandiri| M1{Jumlah Dokumen == 4?}
    M1 -->|Ya (4 dokumen)| M2{Peringkat 1 / 2 / 3?}
    M2 -->|Tidak (0 / bukan juara)| Out2[Tidak memperoleh dana penghargaan, hanya untuk Juara 1/2/3]

    CheckKegiatan -->|PKM| P1{Jumlah Dokumen == 4?}
    P1 -->|Ya (4 dokumen)| P2{Status Pendanaan == 1?}
    P2 -->|Ya (lolos)| Out3[Berhak memperoleh dana penghargaan, PKM lolos pendanaan]