echo "********************************************************"
echo "Starting Organization service"
echo "USing Profile:" $PROFILE
echo "********************************************************"
java --server.port=$SERVER_PORT
     --spring.config.import=$SPRING_CONFIG_IMPORT
     --spring.profiles.active=$PROFILE -jar organization.jar