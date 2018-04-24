package br.com.dennisbeauty.mobile.myapplication.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseCreator extends SQLiteOpenHelper {


    public static final String NAME_DB = "DennisBeauty.db";

    public DatabaseCreator(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {


        String Sql_Unidade = "create table Unidade\n" +
                "(\n" +
                "\tid int primary key AUTOINCREMENT,\n" +
                "    cnpj varchar(18),\n" +
                "    cep varchar(18),\n" +
                "    numero_end varchar(10),\n" +
                "    telefone varchar(18),\n" +
                "\tnome varchar(100)\n" +
                ");\n" ;

      String Sql_func = " create table Funcionarios\n" +
                " (\n" +
                "\tid int primary key AUTOINCREMENT, \n" +
                "    nome varchar(255),\n" +
                "    cpf varchar(11),\n" +
                "    data_nascimento datetime,\n" +
                "    sexo varchar(13), \n" +
                "    email varchar(255),\n" +
                "    cod_unidade int not null,\n" +
                "    endereco varchar(255),\n" +
                "    numero_end varchar (10), \n" +
                "    cep varchar(8),  \n" +
                "    telefone varchar(10), \n" +
                "    celular varchar(11), \n" +
                "    constraint fk_Unidade foreign key (cod_unidade) references Unidade(id)\n" +
                " );\n" +
                "\n" ;
      String Sql_Agenda ="create table Agenda\n" +
                "(\n" +
                "\tid int primary key AUTOINCREMENT,\n" +
                "    hora_entrada datetime,\n" +
                "    hora_saida datetime,\n" +
                "    dia_semana varchar(10),\n" +
                "    dia_mes varchar(2),\n" +
                "    cod_func int not null,\n" +
                "    constraint fk_Funcionario foreign key (cod_func) references Funcionarios(id)\n" +
                ");\n" +
                "\n" ;

       String Sql_Servico ="Create Table Servico \n" +
                "(\n" +
                "    id int primary key AUTOINCREMENT, \n" +
                "    nome varchar(255),\n" +
                "    tipoServico varchar(150),  \n" +
                "    TempoExecucao time,\n" +
                "    descricao varchar (255),\n" +
                "    valor float,\n" +
                "    observacoes varchar(255)\n" +
                "    \n" +
                ");\n" +
                "\n";
                String Sql_Profissional = "create table profissional_servico\n" +
                "(\n" +
                "\tcod_profissional int not null, \n" +
                "    cod_servico int not null,\n" +
                "\tespecialida bolean,\n" +
                "    constraint fk_Profissional foreign key (cod_profissional) references Funcionarios(id),\n" +
                "\tconstraint fk_Servico foreign key (cod_servico) references Servico(id)\n" +
                ");\n" +
                "\n";
                String Sql_Users = "Create Table Users \n" +
                "(\n" +
                "    id int primary key AUTOINCREMENT, \n" +
                "    nome varchar(100) , \n" +
                "    cpf varchar(11) , \n" +
                "    data_nascimento datetime, \n" +
                "    sexo varchar(1),   \n" +
                "    email varchar(255), \n" +
                "    endereco varchar(255), \n" +
                "    numero_end varchar(10), \n" +
                "    cep varchar (200), \n" +
                "    telefone varchar(10), \n" +
                "    celular varchar(11),\n" +
                "    senha varchar(255),\n" +
                "    tipoacesso int,\n" +
                "\tcreate_at datetime,\n" +
                "\tupdate_at datetime,\n" +
                "    id_user_last_update varchar(200)\n" +
                "  );\n" +
                "  \n" ;
                String Sql_categoria = "create table categoria_menu(\n" +
                "\tid int primary key AUTOINCREMENT,\n" +
                "\tcategoria varchar(255),\n" +
                "\tdescription varchar(266),\n" +
                "\ttipo_acesso int\n" +
                ");\n" +
                "  \n" +
                "  \n" ;
                String Sql_rotas= "create table Rotas\n" +
                "(\n" +
                "\tid int primary key AUTOINCREMENT,\n" +
                "    link varchar(50),\n" +
                "    description varchar(100),\n" +
                "    tipo_acesso int,\n" +
                "\tcod_categoria varchar(200)\t\n" +
                ");\n" +
                "\n" +
                "\n" ;
               String sql_Agendamento =  "Create Table Agendamento \n" +
                "(\n" +
                "    id int primary key AUTOINCREMENT ,\n" +
                "    data_agendamento datetime not null, \n" +
                "    horario_agendamento time not null,  \n" +
                "    cod_user int not null, \n" +
                "    cod_agenda int not null,             \n" +
                "    observacoes varchar(255),\n" +
                "    cod_servico int  not null, \n" +
                "    constraint fk_Cliente_agendamento foreign key (cod_user) references Users(id),  \n" +
                "    constraint fk_Profissional_agendamento foreign key (cod_agenda) references Agenda(id), \n" +
                "    constraint fk_Servico_agendamento foreign key (cod_servico) references Servico(id)\n" +
                ");\n" +
                "\n" +
                "\n" ;
               String sql_Post = " create table Post \n" +
                "(\n" +
                "id int not null PRIMARY KEY AUTOINCREMENT,\n" +
                "cod_user int not null,\n" +
                "descricao varchar(300),\n" +
                "create_at datetime,\n" +
                "update_at datetime,\n" +
                "id_user_create varchar(200),\n" +
                "id_user_update varchar(200),\n" +
                "constraint fk_User foreign key (cod_user) references users(id)\n" +
                ");\n";

        sqLiteDatabase.execSQL(Sql_Unidade);
        sqLiteDatabase.execSQL(Sql_func);
        sqLiteDatabase.execSQL(Sql_Agenda);
        sqLiteDatabase.execSQL(Sql_Servico);
        sqLiteDatabase.execSQL(Sql_Profissional);
        sqLiteDatabase.execSQL(Sql_Users);
        sqLiteDatabase.execSQL(Sql_categoria);
        sqLiteDatabase.execSQL(Sql_rotas);
        sqLiteDatabase.execSQL(sql_Agendamento);
        sqLiteDatabase.execSQL(sql_Post);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
