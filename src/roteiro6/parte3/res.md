O roteiro aplica práticas de inversão de dependência, substituição de liskov
já que é possível substituir a interface Connection pelas classes que o implementam,

<ul>
    <li>
        Inversão de dependências quando nos temos que passar o banco que nos iremos utilizarI
        como parâmetro para o construtor.
    </li>
    <li>
        Substituição de liskov pois permite a substituição do tipo Connection pelas classes que
        a implementam
    </li>
    <li>
        Princípio aberto e fechado com a interface Connection, que possibilita novas conexões
        com outros tipos de banco sem precisar alterar o código das classes
    </li>
    <li>
        Principio de responsabilidade única? Ja que todas as classes de banco lidam apenas
        com coisas referentes a sí
    </li>
</ul>

