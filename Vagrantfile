VAGRANTFILE_API_VERSION = "2"

ENV["LC_ALL"] = "en_US.UTF-8"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  vms = {
      'selenium-server' => {
          :ip => '10.10.0.10',
          :memory => 512,
          :ports => [
              :host => 4444,
              :guest => 4444
          ],
          :bootstrap => true,
          :bootstrap_script => 'vagrant/bootstrap/selenium-bootstrap.sh'
      },
      'selenium-node-chrome' => {
          :ip => '10.10.0.11',
          :memory => 512,
          :ports => [],
          :bootstrap => true,
          :bootstrap_script => 'vagrant/bootstrap/selenium-bootstrap.sh'
      },
      'selenium-node-firefox' => {
          :ip => '10.10.0.12',
          :memory => 512,
          :ports => [],
          :bootstrap => true,
          :bootstrap_script => 'vagrant/bootstrap/selenium-bootstrap.sh'
      },
      'build-server' => {
          :ip => '10.10.0.13',
          :memory => 512,
          :ports => [],
          :bootstrap => true,
          :bootstrap_script => 'vagrant/bootstrap/ci-server.sh'
      },
      'app-server' => {
          :ip => '192.168.0.14',
          :memory => 512,
          :ports => [
              :host => 8080,
              :guest => 80
          ],
          :bootstrap => true,
          :bootstrap_script => 'vagrant/bootstrap/app-server.sh'
      }
  }

  vms.each_key do |name|
    config.vm.define name, :autostart => true do |node|
      node.vm.box = 'ubuntu/trusty64'
      node.vm.hostname = name
      node.vm.network :private_network, ip: vms[name][:ip], hostsupdater: "skip"

      vms[name][:ports].each do |port_mapping|
        node.vm.network :forwarded_port, guest: port_mapping[:guest], host: port_mapping[:host]
      end

      node.vm.provider :virtualbox do |vb|
        vb.gui = false
        vb.memory = vms[name][:memory]
      end
      
      if vms[name][:bootstrap]
        node.vm.provision :shell, path: vms[name][:bootstrap_script], privileged: false
      end
    end
  end
end