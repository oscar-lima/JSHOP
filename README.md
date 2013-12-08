JSHOP
=====

This repository was created to make tea with jshop, a classical planning problem which will introduce you to this hierarchichal planning approach.

So here are the steps, enjoy.

Clone the repository:

    cd ~
    git clone git@github.com:oscar-lima/JSHOP.git
    
Configure your bashrc:

    echo "export CLASSPATH=~/JSHOP/bin/antlr.jar:~/JSHOP/bin/JSHOP2.jar:." >> ~/.bashrc
    
Compile:

    cd ~/JSHOP
    make
    
If no errors then installation is done, congrats! ;)

JSHOP usage
===========

run the examples by doing make command:

        cd ~/JSHOP
        make 1
        
Open README file for more details.

Now try to run the tea problem:

        cd ~/JSHOP
        make tea
