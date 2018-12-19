# elk-project
   
   * Docker spring-boot (example)
        - logback.xml configurado usando LogstashTcpSocketAppender para transferir os logs da aplicação para o logstash
   
   * Docker ELK
       * Logstash
            - Recebendo logs da aplicação spring-boot via TCP
             Persistindo dados no ElasticSearch
   
       * ElasticSearch
            - Armazenamento de logs
       
       * Kibana
            - Plugin de visualização de dados para o ES
            


## Overview


# Como rodar?

    1. 
    2. Inicializar o docker executando `docker-compose up`
    3. Criar um index pattern 'logstash-*', no Kibana
    