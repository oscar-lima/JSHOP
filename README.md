JSHOP2 PS assignment
====================

JSHOP installation
==================

Clone the repository:

    cd ~
    git clone git@github.com:oscar-lima/JSHOP.git
    
Configure your bashrc:

    echo "export CLASSPATH=~/JSHOP/bin/antlr.jar:~/JSHOP/bin/JSHOP2.jar:." >> ~/.bashrc
    
Compile:

    cd ~/JSHOP
    make
    
If no erros then installation is done, congrats! ;)

JSHOP usage
===========

run the examples by doing make command:

        cd ~/JSHOP
        make 1
        
Open README file for more details.

Now try to run the tea template:

        cd ~/JSHOP
        make tea
        
Solving homework
================

First try to run basic example, see the files and try to understand what is happening there, the forall example is also very nice it is about a truck that have to transport packages between two cities
